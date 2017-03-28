public class Rectangular {
public static void main(String[] args){
int length = Integer.parseInt(args[0]);
int width = Integer.parseInt(args[1]);

Rectangle my Rectangle = new Rectangle(length,width);

String output = String.Format("*** Your Rectangle ***\n\nLength: %d\nWidth: %d\nArea: %d\nPerimeter: %d\n\", myRectangle.length, myRectangle.width, myRectangle.getArea(), myRectangle.get Perimeter());

System.out.println(output);
}
}

