public class Square {
    public float canh;
    public void showCanh(){
        System.out.println(canh);
    }

    public void chuvi(){
        float p;
        p = canh * 4;
        System.out.println("Chu vi hinh vuong la: " + p);
    }

    public void dientich(){
        float S;
        S = canh * canh;
        System.out.println("Dien tich hinh vuong la: " + S);
    }

    public void show(){
        showCanh();
        chuvi();
        dientich();
    }

}
