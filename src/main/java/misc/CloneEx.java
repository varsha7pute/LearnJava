package misc;

class CloneEx implements Cloneable {
    String name = "GeeksForGeeks";

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    public static void main(String[] args) {
        try {
            CloneEx g1 = new CloneEx();
            CloneEx g2 = (CloneEx) g1.clone();
            System.out.println(g2.name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}