package lab2;

class subtract {
    int sub(int a, int b){
        return a-b;
    }
    double sub(double a, double b){
        return a-b;
    }
    int sub(int a, int b, int c){
        return a-b-c;
    }
    public static void main(String args[]){
        subtract s = new subtract();

        System.out.println(s.sub(10,5));
        System.out.println(s.sub(8.97,4.56));
        System.out.println(s.sub(19,17,16));
    }
}
