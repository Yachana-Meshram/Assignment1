class Box{
    float height;
    float width;
    float breadth;

    Box(float h, float w, float b){
         height= h;
         width= w;
         breadth=b;
    }
    float getVolume(){
        return height*width*breadth;
    }
    float getArea(){
        return 2*(height*width+width*breadth+height*breadth);
    }

    public static void main(String[] args){
        Box obj1= new Box(10.0f,11.0f,12.0f);
        Box obj2=new Box(5.0f,6.0f,7.0f);
        System.out.println("The volume of box is " + obj1.getVolume());
        System.out.println("The Area of box is " + obj1.getArea());
        System.out.println("The volume of box is " + obj2.getVolume());
        System.out.println("The Area of box is " + obj2.getArea());


    }
}