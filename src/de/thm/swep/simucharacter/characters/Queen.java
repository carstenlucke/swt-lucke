package de.thm.swep.simucharacter.characters;

import de.thm.swep.simucharacter.Character;
import de.thm.swep.simucharacter.behaviors.weapon.KnifeBehavior;

/**
 * Konkrete Character-Klasse, die eine Königin repräsentiert.
 *
 * <p>Diese Klasse demonstriert, wie im Strategy Pattern konkrete Context-Subklassen
 * ihre spezifische Strategie im Konstruktor setzen. Die Königin verwendet eine
 * diskrete Nahkampfstrategie mit einem Messer.</p>
 *
 * <p><b>Strategy-Initialisierung:</b> Die konkrete Strategy wird im Konstruktor
 * gesetzt, könnte aber zur Laufzeit durch Setter oder andere Methoden geändert werden
 * (Flexibilität des Strategy Patterns).</p>
 *
 * @see Character
 * @see KnifeBehavior
 */
public class Queen extends Character {

    /**
     * Erstellt eine Königin mit Messer-Kampfverhalten.
     *
     * <p>Im Konstruktor wird die konkrete Strategy (KnifeBehavior) instanziiert
     * und dem geerbten weaponBehavior-Feld zugewiesen.</p>
     */
    public Queen() {
        weaponBehavior = new KnifeBehavior();
    }
}
