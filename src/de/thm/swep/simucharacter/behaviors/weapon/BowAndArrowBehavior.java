package de.thm.swep.simucharacter.behaviors.weapon;

/**
 * Concrete Strategy für das Strategy Pattern - implementiert das Bogen-Kampfverhalten.
 *
 * <p><b>Rolle im Pattern:</b> Concrete Strategy</p>
 *
 * <p>Diese Klasse implementiert eine konkrete Strategie für das Waffenverhalten.
 * Sie kapselt den spezifischen Algorithmus für den Fernkampf mit Pfeil und Bogen.</p>
 *
 * @see WeaponBehavior
 * @see de.thm.swep.simucharacter.Character
 */
public class BowAndArrowBehavior implements WeaponBehavior {
    /**
     * Führt das Bogen-Kampfverhalten aus.
     */
    @Override
    public void useWeapon() {
        System.out.println("Schießt mit Pfeil und Bogen.");
    }
}
