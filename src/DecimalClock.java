import acm.graphics.GCanvas;

public class DecimalClock {

    private final int SIZE = 3;
    private final DecimalNumber[] decNums = new DecimalNumber[SIZE];

    /* Construeix un rellotge que usa tres nombres decimals per a indicar hores, minuts i segons i el col·loca en la caixa indicada per dcBox.
     */
    public DecimalClock (Box dcBox) {
        int numDigits = 2;
        Box[] boxes = dcBox.distributeHorizontally(SIZE);
        for (int i = 0; i < SIZE; i++) {
            decNums[i] = new DecimalNumber(numDigits, boxes[i]);
        }
    }

    /* Afegeix els tres números al canvas indicat per gCanvas.
     */
    public void addToGCanvas (GCanvas gCanvas) {
        for (DecimalNumber decNum : decNums) {
            decNum.addToGCanvas(gCanvas);
        }
    }

    /* Mostra l'hora indicada.
     */
    public void render (int hours, int minutes, int seconds) {
        decNums[0].render(hours);
        decNums[1].render(minutes);
        decNums[2].render(seconds);
    }

}