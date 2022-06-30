public enum Size {
    SMALL("S",14,16), MEDIUM("M", 18,21), LARGE("L",23,25), EXTRA_LARGE("XL", 28,31);
    String shortname;
    int width, lenght;

    Size(String shortname, int width, int lenght) {
        this.shortname = shortname;
        this.width = width;
        this.lenght = lenght;
    }

    public String getShortname() {
        return shortname;
    }

    public int getWidth() {
        return width;
    }

    public int getLenght() {
        return lenght;
    }

    @Override
    public String toString() {
        return getShortname()+ "or"+ super.name()+ "size" + getWidth()+"lengt"+getLenght();
    }
}
