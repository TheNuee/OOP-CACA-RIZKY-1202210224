public class Calculation implements Runnable{
    public double radius;
    public double side;
    public double area;
    public double phi = 3.14;


    public void setSquare(double side) throws IllegalArgumentException{
        this.side = side;
        if (side<1){
            throw new IllegalArgumentException("Nilai sisi harus lebih dari 1!!");
        }else {
            this.area = side*side;
        }
    }

    public double getSquare(){
        return area;
    }

    public void setCircle(double radius){
        this.radius = radius;
        if(radius<1){
            throw new IllegalArgumentException("Nilai Jari-Jari harus lebih dari 1!!");
        }else{
            this.area = phi*radius*radius;
        }
    }

    public double getCircle(){
        return area;
    }

    public void setTrapezoid(double a, double b, double t){
        if(t<1 || a<1 || b<1){
            throw new IllegalArgumentException("Nilai Sisi harus lebih dari 1!!");
        }else {
            this.area = 0.5 * t * (a + b);
        }
    }
    public double getTrapezoid(){
        return area;
    }
    
    @Override
    public void run() {
        System.out.println("=====Program Will Start in=====");
        for (int i=3; i>0; i--){
            try {
                System.out.println("Starting with thrad " + i);
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

    }
}