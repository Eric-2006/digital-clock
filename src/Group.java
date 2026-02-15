import acm.graphics.GCanvas;

public class Group {

    private final Bar[] bars;

    /*
    Construeix un grup en la caixa indicada per groupBox,
    formada per tantes barres com elements tingui la taula sizes.
    La taula sizes conté el nombre de leds que tenen cadascuna de les barres.
    Les barres estan disposades, una damunt de l'altra, verticalment.
    L'ordre dels sizes es correspon a les mides de les barres de dalt cap avall.
    */
    public Group (int[] sizes, Box groupBox) {
        bars = new Bar[sizes.length];
        Box[] boxes = groupBox.distributeVertically(sizes.length);
        for (int i = 0; i < sizes.length; i++) {
            bars[i] = new Bar(sizes[i], boxes[i]);
        }
    }

    /* Afegeix totes les barres que formen el grup al canvas gCanvas.
     */
    public void addToGCanvas (GCanvas gCanvas) {
        for (Bar bar : bars) {
            bar.addToGCanvas(gCanvas);
        }
    }

    /*
    Mostra, en cadascuna de les barres del grup, el valor corresponent de la taula values.
    L'ordre dels elements a la taula values és de baix cap amunt.
    D'aquesta manera, si voleu mostrar el valor d'un número a partir de les seves xifres, la xifra corresponent a les unitats estarà en la posició 0 del vector values.
    */
    public void render (int[] values) {
        int j = values.length - 1;
        for (int i = 0; i < bars.length; i++) {
            bars[i].render(values[j]);
            j--;
        }
    }

}