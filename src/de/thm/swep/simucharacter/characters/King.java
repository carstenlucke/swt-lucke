package de.thm.swep.simucharacter.characters;

import de.thm.swep.simucharacter.Character;
import de.thm.swep.simucharacter.behaviors.weapon.BowAndArrowBehavior;

/**
 * Konkrete Character-Klasse, die einen König repräsentiert.
 *
 * <p>Diese Klasse demonstriert, wie im Strategy Pattern konkrete Context-Subklassen
 * ihre spezifische Strategie im Konstruktor setzen. Der König verwendet die
 * Fernkampfstrategie mit Pfeil und Bogen.</p>
 *
 * <p><b>Strategy-Initialisierung:</b> Die konkrete Strategy wird im Konstruktor
 * gesetzt, könnte aber zur Laufzeit durch Setter oder andere Methoden geändert werden
 * (Flexibilität des Strategy Patterns).</p>
 *
 * @see Character
 * @see BowAndArrowBehavior
 */
public class King extends Character {

    /**
     * Erstellt einen König mit Bogen-Kampfverhalten.
     *
     * <p>Im Konstruktor wird die konkrete Strategy (BowAndArrowBehavior) instanziiert
     * und dem geerbten weaponBehavior-Feld zugewiesen.</p>
     */
    public King() {
        weaponBehavior = new BowAndArrowBehavior();
    }
}
