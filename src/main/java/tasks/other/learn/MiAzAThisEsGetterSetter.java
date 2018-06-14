package tasks.other.learn;

// Gondoltam csinálok egy main()-t bele. De ha tüzetesebben megnézed a repomat
// akkor láthatod, hogy mindenre teszteket írtam. src/test/... útvonalon látni.
//
// De, hogy megértsük mi az a Getter Setter és this, most csak subclassokkal fogok foglalkozni, ha nem bánod.
// nem hozok létre másik fájlokat. Tekintheted úgy is, hogy különállóak.

public class MiAzAThisEsGetterSetter {
    public static void main(String[] args) {
        SetterGetterLearn a = new SetterGetterLearn();
        SetterGetterLearn b = new SetterGetterLearn();

        // Mint láthatod, mind 2 példány esetén a "this" mindig
        // csak az adott-ra vonatkozik.
        // Ha a-ból hívom, akkor csak az "a" által lefoglalt memória területre mutat. "b"-be nem szól bele.
        // Azaz mindig csak az adott példány hatáskörében van. Kintről "a"-ként hivatkozok rá, míg a class-ból this-ként
        // "b" esetén szintúgy. b.setCount(...) kívülről, de a "b" memória területén már az a this oda mutat, így csak
        // azon a területnek van kihatása a this-nek.
        a.setCount(10);
        b.setCount(20);
        System.out.println(a.getCount());
        System.out.println(b.getCount());

        // Fontos! statikus metóduson belül nem használhatsz this-t mert az nem része a példánynak, de lehet hivatkozni rá.
        // Inkább osztály része. Lásd: defaultnak beállítottam neki 0-át.
        System.out.println(b.getStaticInteger());
        System.out.println(a.getStaticInteger());
        System.out.println(SetterGetterLearn._getStaticInteger()); // csak név ütközés miatt van benne a _ karakter :)

        // de ha módosítom valahol? Most az "a"-ból.
        a.setStaticInteger(100);
        System.out.println(b.getStaticInteger());
        System.out.println(a.getStaticInteger());
        System.out.println(SetterGetterLearn._getStaticInteger());

        // most a "b"-ből
        b.setStaticInteger(200);
        System.out.println(b.getStaticInteger());
        System.out.println(a.getStaticInteger());
        System.out.println(SetterGetterLearn._getStaticInteger());

        // most static metódusból
        SetterGetterLearn._setStaticInteger(300);
        System.out.println(b.getStaticInteger());
        System.out.println(a.getStaticInteger());
        System.out.println(SetterGetterLearn._getStaticInteger());
    }

    /**
     * Mint láthatod a setter-getter nem csinál mást, mint
     * a class attribútumait (késöbb csak attr.) tölti fel/ki.
     *
     * Lekérő:
     * get -> nyersen lekéri az adatot
     * is -> logikai választ ad {return boolean}
     * has -> tartalmi vizsgálat {return boolean általában}
     *
     * Feltöltő:
     * set -> beállít, feltölt valamit
     * add -> hozzáad valamit valamihez, vagy bővít egy halmazt vagy sort.
     *
     * De ezek csak elnevezések.
     * egy getter metódus neve is lehet simán ez is akár: "addVisszaTeParaszt"
     *
     * Bár egyes keretrendszerek alapértelmezésnek veszik, ha "valami" attr.-ra
     * setValami, getValami az elnevezései, és úgy probálják hívni, és hibát dobnak ha nem találják.
     *
     * A lényeg a mögöttes logika.
     *
     * Megj.: "static" csak azért kellet a class-hoz, hogy main()-ből tudjam hívni. "private" meg csak láthatóság, ami most
     * jelen esetben bármi lehet.
     */
    private static class SetterGetterLearn {
        private int count;
        private boolean done;

        private static int staticInteger = 0;

        /**
         * @return visszaadja a count értékét
         */
        public int getCount() {
            return count;
        }

        /**
         * Beállítja a count-tot.
         *
         * Mint észrevetted, valahol csak "return count;" szerepel és nem "return this.count".
         * Ez azért van, mert ha nem foglalt a név, és létezik ilyen osztály változó / attribútum, akkor
         * az értelmezi.
         * Természetesen mindenhova írhattam volna this.count-tot vagy this.done-t is akár.
         * DE! Ha foglalt a lokális változó miatt, akkor a this kötelező, ha attr.-ot akarod elérni, mint a setCount
         * esetén.
         *
         * @param count
         */
        public void setCount(int count) {
            this.count = count;
        }

        /**
         * @return visszaadja a done értékét
         */
        public boolean isDone() {
            return done;
        }

        /**
         * @param a
         * @param b
         * @return count az "a" és "b" között van.
         */
        public boolean hasMid(int a, int b) {
            return a < count && count < b;
        }

        /**
         * @return páros-e a count?
         */
        public boolean isParos() {
            return count % 2 == 0;
        }

        /**
         * Szint úgy kötelező a this.done, mert a paraméterben lefoglalódott a neve.
         *
         * @param done
         */
        public void setDone(boolean done) {
            this.done = done;
        }

        public void setStaticInteger(int value) {
            SetterGetterLearn.staticInteger = value;
        }

        public int getStaticInteger() {
            return SetterGetterLearn.staticInteger;
        }

        public static void _setStaticInteger(int value) {
            SetterGetterLearn.staticInteger = value;
        }

        public static int _getStaticInteger() {
            return SetterGetterLearn.staticInteger;
        }
    }
}
