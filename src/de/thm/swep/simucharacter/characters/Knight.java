package de.thm.swep.simucharacter.characters;

import de.thm.swep.simucharacter.Character;
import de.thm.swep.simucharacter.behaviors.weapon.SwordBehavior;

/**
 * Konkrete Character-Klasse, die einen Ritter repräsentiert.
 *
 * <p>Diese Klasse demonstriert, wie im Strategy Pattern konkrete Context-Subklassen
 * ihre spezifische Strategie im Konstruktor setzen. Der Ritter verwendet die
 * klassische Nahkampfstrategie mit einem Schwert.</p>
 *
 * <p><b>Strategy-Initialisierung:</b> Die konkrete Strategy wird im Konstruktor
 * gesetzt, könnte aber zur Laufzeit durch Setter oder andere Methoden geändert werden
 * (Flexibilität des Strategy Patterns).</p>
 *
 * @see Character
 * @see SwordBehavior
 */
public class Knight extends Character {

    /**
     * Erstellt einen Ritter mit Schwert-Kampfverhalten.
     *
     * <p>Im Konstruktor wird die konkrete Strategy (SwordBehavior) instanziiert
     * und dem geerbten weaponBehavior-Feld zugewiesen.</p>
     */
    public Knight() {
        weaponBehavior = new SwordBehavior();
    }
}
