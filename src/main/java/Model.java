class Model {

    private String name;
    private Double temp;
    private Double humidity;
    private String icon;

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    Double getTemp() {
        return temp;
    }

    void setTemp(Double temp) {
        this.temp = temp;
    }

    Double getHumidity() {
        return humidity;
    }

    void setHumidity(Double humidity) {
        this.humidity = humidity;
    }

    String getIcon() {
        return icon;
    }

    void setIcon(String icon) {
        this.icon = icon;
    }
}
