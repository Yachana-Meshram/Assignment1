class Student {
    String name = "Yachana";
    int sub1 = 80;
    int sub2 = 80;
    int sub3 = 100;


    int sum() {
        return sub1 + sub2 + sub3;
    }

    int total=sum();

    float avg() {
        return total/3;
    }
    public static void main(String[] args){
        Student obj = new  Student();

        System.out.println("The Student name is "+ obj.name);
        System.out.println("The total marks obtained is "+ obj.total);
        System.out.println("The average is " + obj.avg());
    }
}
