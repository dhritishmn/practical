public class boxunbox {
    public static void main(String[] args) {
        
        int num = 10;
        Integer boxedNum = Integer.valueOf(num);
        System.out.println("Boxed Number: " + boxedNum);

        
        Integer objNum = Integer.valueOf(20);
        int unboxedNum = objNum.intValue();
        System.out.println("unboxed Number: " + unboxedNum);

    }
    
}
