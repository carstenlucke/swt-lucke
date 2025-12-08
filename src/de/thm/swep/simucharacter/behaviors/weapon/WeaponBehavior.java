package de.thm.swep.simucharacter.behaviors.weapon;

/**
 * Strategy Interface für das Strategy Pattern (Gang of Four).
 *
 * <p>Dieses Interface definiert eine Familie von Algorithmen (verschiedene Waffenverhalten),
 * die untereinander austauschbar sind. Das Strategy Pattern ermöglicht es, den Algorithmus
 * unabhängig von den Clients zu variieren, die ihn verwenden.</p>
 *
 * <p><b>Rolle im Pattern:</b> Strategy Interface</p>
 *
 * <p><b>Zweck:</b> Definiert eine gemeinsame Schnittstelle für alle konkreten Strategien.
 * Der Context (Character) kann damit verschiedene Strategien verwenden, ohne deren
 * konkrete Implementierung zu kennen.</p>
 *
 * @see AxeBehavior
 * @see BowAndArrowBehavior
 * @see KnifeBehavior
 * @see SwordBehavior
 * @see de.thm.swep.simucharacter.Character
 */
public interface WeaponBehavior {

    /**
     * Führt das waffenspezifische Verhalten aus.
     *
     * <p>Diese Methode wird von verschiedenen konkreten Strategien unterschiedlich
     * implementiert, um verschiedene Kampfverhaltensweisen zu realisieren.</p>
     */
    void useWeapon();
}
