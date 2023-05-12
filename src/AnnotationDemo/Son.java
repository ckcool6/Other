package AnnotationDemo;


public class Son extends Father{
    @Override
    public void show() {
        super.show();
    }
    @Deprecated
    public void method(){
        System.out.println("method......");
    }
    @SuppressWarnings(value = "all")
    public void function(){
        int a = 10;
        int b = 20;
        //System.out.println(a);
        //System.out.println(b);
    }
}
