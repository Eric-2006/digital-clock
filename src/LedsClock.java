import acm.graphics.GCanvas;

public class LedsClock {

    private final int SIZE = 3;
    private final Group[] groups = new Group[SIZE];

    /* Construeix un rellotge que usa tres grups de barres de leds per a indicar hores, minuts i segons i el col·loca en la caixa indicada per lcBox.
     */
    public LedsClock (Box lcBox) {
        int numBars = 2;
        int[] sizes = new int[numBars];
        for (int i = 0; i < numBars; i++) {
            int numLeds = 10;
            if (i == 0) {
                numLeds = 6;
            }
            sizes[i] = numLeds;
        }

        Box[] boxes = lcBox.distributeVertically(SIZE);
        for (int i = 0; i < SIZE; i++) {
            int[] tmp = sizes;
            if (i == 0) {
                tmp = new int[]{3, 10};
            }
            groups[i] = new Group(tmp, boxes[i]);
        }
    }

    /* Afegeix els grups de barres de leds al canvas gCanvas.
     */
    public void addToGCanvas (GCanvas gCanvas) {
        for (Group group : groups) {
            group.addToGCanvas(gCanvas);
        }
    }

    /* Mostra l'hora indicada.
     */
    public void render (int hours, int minutes, int seconds) {
        int[] H = {hours % 10, hours / 10};
        int[] M = {minutes % 10, minutes / 10};
        int[] S = {seconds % 10, seconds / 10};

        groups[0].render(H);
        groups[1].render(M);
        groups[2].render(S);
    }

}