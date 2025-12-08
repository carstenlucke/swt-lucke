package de.thm.swep.simucharacter.behaviors.weapon;

/**
 * Concrete Strategy für das Strategy Pattern - implementiert das Axt-Kampfverhalten.
 *
 * <p><b>Rolle im Pattern:</b> Concrete Strategy</p>
 *
 * <p>Diese Klasse implementiert eine konkrete Strategie für das Waffenverhalten.
 * Sie kapselt den spezifischen Algorithmus für den Kampf mit einer Axt.</p>
 *
 * @see WeaponBehavior
 * @see de.thm.swep.simucharacter.Character
 */
public class AxeBehavior implements WeaponBehavior {
    /**
     * Führt das Axt-Kampfverhalten aus.
     */
    @Override
    public void useWeapon() {
        System.out.println("Hackt mit der Axt.");
    }
}
