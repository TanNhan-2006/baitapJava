public class Bai15 {
    public static class InvoiceItemm {
        private String id;
        private String desc;
        int qty;
        double unitPrice;

        public InvoiceItemm(String id, String desc, int qty, double unitPrice){
            this.id = id;
            this.desc = desc;
            this.qty = qty;
            this.unitPrice = unitPrice;
        }

        public String getId(){
            return id;
        }
        public String getDesc(){
            return desc;
        }
        public int getQty(){
            return qty;
        }
        public void setQty(int qty){
            this.qty = qty;
        }
        public double getUnitPrice(){
            return unitPrice;
        }
        public void setUnitPrice(double unitPrice){
            this.unitPrice = unitPrice;
        }
        public double getTotal(){
            return unitPrice*qty;
        }

        @Override
        public String toString(){
            return "InvoiceItem[id="+id+", desc="+desc+",qty="+qty+",unitPrice="+unitPrice+"]";
        }
    }

    public static void main(String[] args){
        InvoiceItemm n = new InvoiceItemm("A101","Pen Red",888,0.08);
        System.out.println(n);
        n.setQty(999);
        n.setUnitPrice(0.09);
        System.out.println(n);

        System.out.println("id is: "+n.getId());
        System.out.println("desc is: "+n.getDesc());
        System.out.println("qty is: "+n.getQty());
        System.out.println("unitPrice is: "+n.getUnitPrice());
    }
}
