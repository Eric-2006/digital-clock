import acm.graphics.GCanvas;

public class DecimalNumber {

    private final DecimalDigit[] digits;

    /* Construeix un número decimal format per numDigits dígits.
    El número ocuparà l'espai indicat per dnBox. Els dígits estan disposats, un al costat de l'altre, de forma horitzontal.
    */
    public DecimalNumber (int numDigits, Box dnBox) {
        digits = new DecimalDigit[numDigits];
        Box[] boxes = dnBox.distributeHorizontally(numDigits);
        for (int i = 0; i < numDigits; i++) {
            digits[i] = new DecimalDigit(boxes[i]);
        }
    }

    /* Afegeix els dígits al canvas indicat per gCanvas.
     */
    public void addToGCanvas (GCanvas gCanvas) {
        for (DecimalDigit decDigit : digits) {
            decDigit.addToGCanvas(gCanvas);
        }
    }

    /* Mostra el número indicat per number usant els diferents dígits de què consta el número.
     */
    public void render(int number) {
        String numberStr = String.format("%0" + digits.length + "d", number);
        for (int i = 0; i < digits.length; i++) {
            digits[i].render(numberStr.charAt(i) - '0');
        }
    }

}