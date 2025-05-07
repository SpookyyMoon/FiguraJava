public class Figura {
    public String color;
    public String nombre;
    public int posX;
    public int posY;

    public Figura(String color, String nombre, int posX, int posY){
        this.color = color;
        this.nombre = nombre;
        this.posX = posX;
        this.posY = posY;
    }

    public String getColor() {
        return color;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public float calcularArea(){
        return 0;
    }

    public float calcularPerimetro(){
        return 0;
    }

    public void moverFigura(){

    }


}
