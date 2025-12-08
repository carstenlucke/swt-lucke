package de.thm.swep.simucharacter.characters;

import de.thm.swep.simucharacter.Character;
import de.thm.swep.simucharacter.behaviors.weapon.AxeBehavior;

/**
 * Konkrete Character-Klasse, die einen Troll repräsentiert.
 *
 * <p>Diese Klasse demonstriert, wie im Strategy Pattern konkrete Context-Subklassen
 * ihre spezifische Strategie im Konstruktor setzen. Der Troll verwendet eine
 * brutale Nahkampfstrategie mit einer Axt.</p>
 *
 * <p><b>Strategy-Initialisierung:</b> Die konkrete Strategy wird im Konstruktor
 * gesetzt, könnte aber zur Laufzeit durch Setter oder andere Methoden geändert werden
 * (Flexibilität des Strategy Patterns).</p>
 *
 * @see Character
 * @see AxeBehavior
 */
public class Troll extends Character {

    /**
     * Erstellt einen Troll mit Axt-Kampfverhalten.
     *
     * <p>Im Konstruktor wird die konkrete Strategy (AxeBehavior) instanziiert
     * und dem geerbten weaponBehavior-Feld zugewiesen.</p>
     */
    public Troll() {
        weaponBehavior = new AxeBehavior();
    }
}
