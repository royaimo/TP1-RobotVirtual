package mascotaVirtual;

public class Robot {
    // Características/atributos de un Robot Virtual
    String nombre;
    int energia;

    //Definimos los métodos constructores
    public Robot(){}
    public Robot(String nombre, int energia){
        this.nombre = nombre;
        this.energia = energia;
    }

    //METODOS GETTERS Y SETTERS
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getEnergia(){
        return "La energia de " + nombre + " es " +  energia + "%";
    }
    public void setEnergia(int energia){
        this.energia = energia;
    }

    //Comportamientos de un Robot Virtual
    //comer
    public void getComer(){
        System.out.println("El robot " + nombre + " puede COMER");
    }
    public void getLLeno(){
        System.out.println("Robot " + nombre + " esta recargado y quiere JUGAR");
    }
    public void setComer(){
        if (energia>=100){
            getLLeno();
        }
        if (energia > 0 && energia<=90){
            setEnergia(energia+10);
            if(energia>=100){
                getLLeno();
            }else {
                getComer();
            }
        }else if(energia == 0){
            getAgotado();
        }
    }
    //BATERIAS AGOTADAS
    public void getAgotado(){
            System.out.println("El robot " + nombre + " esta AGOTADO, NECESITA COMER O REVIVIR");
    }

    //revivir las mascota
    public void setRevivir(){
        energia=100;
    }

    //jugar
    public void getJugar(){
        System.out.println("El robot " + nombre + " puede JUGAR");
    }
    public void setJugar(){
        if(energia > 0 && energia<=100) {
            setEnergia(energia - 10);
            getJugar();
        }
        if(energia <= 0){
            getAgotado();
        }
    }


}//fin clase Robot
