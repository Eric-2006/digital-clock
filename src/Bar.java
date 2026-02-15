import acm.graphics.GCanvas;

public class Bar {

    private final Led[] leds;

    /* Construeix una barra en la caixa indicada per barBox, formada per size leds de la mateixa mida col·locats horitzontalment.
     */
    public Bar (int size, Box barBox) {
        leds = new Led[size];
        Box[] boxes = barBox.distributeHorizontally(size);
        for (int i = 0; i < size; i++) {
            leds[i] = new Led(boxes[i]);
        }
    }

    /* Afegeix tots els leds que formen la barra al canvas gCanvas.
     */
    public void addToGCanvas (GCanvas gCanvas) {
        for (Led led : leds) {
            led.addToGCanvas(gCanvas);
        }
    }

    /* Il·lumina el led indicat per value en la barra​, comptant des de 0 de dreta a esquerra.
     */
    public void render (int value) {
        value = leds.length - 1 - value % leds.length;
        leds[0].off();
        for (int i = value; i < leds.length; i++) {
            leds[i].off();
        }
        leds[value].on();
    }

}