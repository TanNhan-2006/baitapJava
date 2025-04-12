package bai7;

import java.io.*;
import java.util.concurrent.*;
import java.util.*;

public class MultiThreadedFileReader {
    private static final int CHUNK_SIZE = 1024 * 1024; // 1MB mỗi đoạn
    private static final String FILE_PATH = "D://ThucHanhCode//HocJava//Week5//bai7//in.txt";
    private static final String OUTPUT_FILE = "D://ThucHanhCode//HocJava//Week5//bai7//out.txt";
    private static final int NUM_THREADS = 4;

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(NUM_THREADS);
        ConcurrentHashMap<Integer, String> contentMap = new ConcurrentHashMap<>();

        try (RandomAccessFile file = new RandomAccessFile(FILE_PATH, "r")) {
            long fileSize = file.length();
            long chunkSize = fileSize / NUM_THREADS;

            for (int i = 0; i < NUM_THREADS; i++) {
                long start = i * chunkSize;
                long end = (i == NUM_THREADS - 1) ? fileSize : (i + 1) * chunkSize;
                executor.execute(new FileReadTask(FILE_PATH, start, end, i, contentMap));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        executor.shutdown();
        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Ghép nội dung đúng thứ tự và ghi ra file
        mergeAndWriteFile(contentMap);
    }

    private static void mergeAndWriteFile(ConcurrentHashMap<Integer, String> contentMap) {
        List<Integer> keys = new ArrayList<>(contentMap.keySet());
        Collections.sort(keys);

        try (FileWriter writer = new FileWriter(OUTPUT_FILE)) {
            for (int key : keys) {
                writer.write(contentMap.get(key));
            }
            System.out.println("File đã được ghép lại thành công.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class FileReadTask implements Runnable {
    private final String filePath;
    private final long start;
    private final long end;
    private final int partIndex;
    private final ConcurrentHashMap<Integer, String> contentMap;

    public FileReadTask(String filePath, long start, long end, int partIndex, ConcurrentHashMap<Integer, String> contentMap) {
        this.filePath = filePath;
        this.start = start;
        this.end = end;
        this.partIndex = partIndex;
        this.contentMap = contentMap;
    }

    @Override
    public void run() {
        try (RandomAccessFile file = new RandomAccessFile(filePath, "r")) {
            file.seek(start);
            byte[] buffer = new byte[(int) (end - start)];
            file.read(buffer);
            contentMap.put(partIndex, new String(buffer));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
