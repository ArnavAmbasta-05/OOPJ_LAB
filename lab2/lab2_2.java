package lab2;

class objectCounter{
       static int count = 0;
    objectCounter(){
        count++;
    }
    public static void main(String args []){
        objectCounter o1 = new objectCounter();
        objectCounter o2 = new objectCounter();
        objectCounter o3 = new objectCounter();
        objectCounter o4 = new objectCounter();

        System.out.println("No. of objects created:" + count);
    }
}
