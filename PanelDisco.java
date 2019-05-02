public class PanelDisco  {
    private String ruta;
    private String name;
    private String totalCapacity;
    private boolean montado;
    private String dispositivo;
    private String sistemaDeArchivos;
    private String usado;
    private String libre;


    public PanelDisco(String ruta, String name, String totalCapacity) {
        this.ruta = ruta;
        this.name = name;
        this.totalCapacity = totalCapacity;
    }

    public PanelDisco(String ruta, String name, String totalCapacity, boolean montado, String dispositivo, String sistemaDeArchivos, String usado, String libre) {
        this.ruta = ruta;
        this.name = name;
        this.totalCapacity = totalCapacity;
        this.montado = montado;
        this.dispositivo = dispositivo;
        this.sistemaDeArchivos = sistemaDeArchivos;
        this.usado = usado;
        this.libre = libre;
    }

    public String getRuta() {
        return ruta;
    }

    public String getName() {
        return name;
    }

    public String getTotalCapacity() {
        return totalCapacity;
    }


}
