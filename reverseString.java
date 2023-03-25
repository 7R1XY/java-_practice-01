class HelloWorld {
    public static void main(String[] args) {
        String str = "SUFIYAN";
        String bag = " ";
        for(int i=str.length()-1; i>=0; i--){
            bag+=str.charAt(i);
        }
        System.out.println(bag);
    }
}
