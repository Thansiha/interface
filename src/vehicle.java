public interface vehicle {
    void changegear();
    void applybreak();
    void speedup();

}
class bicycle implements vehicle{

    @Override
    public void changegear() {
        System.out.println("bicycle need to change gear");
    }

    @Override
    public void applybreak() {
        System.out.println("bicycle need to apply break");

    }

    @Override
    public void speedup() {
        System.out.println("bicycle need to speed up");
    }
}
class bike implements vehicle{
    @Override
    public void changegear() {
        System.out.println("bike need to change gear");
    }

    @Override
    public void applybreak() {
        System.out.println("bike need to apply break");

    }

    @Override
    public void speedup() {
        System.out.println("bike need to speed up");
    }


}
class car implements vehicle{
    @Override
    public void changegear() {
        System.out.println("car need to change gear");
    }

    @Override
    public void applybreak() {
        System.out.println("car need to apply break");

    }

    @Override
    public void speedup() {
        System.out.println("car need to speed up");
    }

}
class java{
    public static void main(String[] args) {
        bicycle obj1 = new bicycle();
        obj1.changegear();
        obj1.applybreak();
        obj1.speedup();

        bike obj2 = new bike();
        obj2.changegear();
        obj2.applybreak();
        obj2.speedup();

        car obj3=new car();
        obj3.changegear();
        obj3.applybreak();
        obj3.speedup();


    }
}