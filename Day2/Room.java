class Room{
int  h= 2;
int  w= 2;
int  b=2;
int volume(){
return h*w*b;
}
public static void main(String[] args){
Room obj= new Room();
System.out.println("The volume is " + obj.volume());

} 
}