package de.thm.swep.simucharacter.behaviors.weapon;

/**
 * Concrete Strategy für das Strategy Pattern - implementiert das Schwert-Kampfverhalten.
 *
 * <p><b>Rolle im Pattern:</b> Concrete Strategy</p>
 *
 * <p>Diese Klasse implementiert eine konkrete Strategie für das Waffenverhalten.
 * Sie kapselt den spezifischen Algorithmus für den Nahkampf mit einem Schwert.</p>
 *
 * @see WeaponBehavior
 * @see de.thm.swep.simucharacter.Character
 */
public class SwordBehavior implements WeaponBehavior {
    /**
     * Führt das Schwert-Kampfverhalten aus.
     */
    @Override
    public void useWeapon() {
        System.out.println("Schwingt das Schwert.");
    }
}
