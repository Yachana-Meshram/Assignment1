class Person{
    int age;
    int height;
    int weight;

    //Constructor
    Person(int a,int h,int w){
        age =a;
        height=h;
        weight=w;

    }
    Person(){
        age =50;
        height=5;
        weight=70;
    }
    int display(){
        System.out.println("Age :" +age +" "+ "Height :" + height +" " + "Weight :" + weight);
        return 0;
    }

    public static void main(String[] args) {
        Person p1=new Person();
        Person p2=new Person(55,6,80);
        p1.display();
        p2.display();

    }
}