class AirPort {
    Airplane airplane;
    String name;

    AirPort(String name) {
        this.name = name;
    }

    String givePermissionToLand(Flyer flyer) {
        if (flyer instanceof Airplane) {
            return "Permission granted to land.";
        } else {
            return "Cannot grant permission to land.";
        }
    }
}