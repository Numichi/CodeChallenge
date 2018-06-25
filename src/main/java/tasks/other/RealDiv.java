package tasks.other;

import java.util.HashSet;
import java.util.Set;

public class RealDiv {
    public Set<Integer> solution(int value) {
        // Létre hozok egy halmazt, ami integer-t tárol.
        // Ide lementem a valódi osztókat. Lásd késöbb.
        Set<Integer> result = new HashSet<>();

        // mivel 1 és önmaga nem valódi osztó, így az "i"-t:
        // {1 < i < N} vagy {2 <= i <= N-1}-ig futtatom, ahol a N most a value értéke.
        // Tehát csak is a valódi osztókon megy végig.
        for(int i = 2; i < value; i++) {

            // Ha nincs maradéka felveszem a halmazba "i" ciklus változót.
            if(value % i == 0) {
                // Itt adom hozzá a halmazhoz.
                // Természetesen, ha az a kérdés, hogy mennyi
                // darab van, akkor nem halmazzal dolgozol, hanem egy
                // egyszerű integerrel és csak növeled 1-el.
                // De ez már feladat függő...
                result.add(i);
            }
        }

        // tartalmazza a valódi osztókat a "result" halmaz.
        return result;
    }
}
