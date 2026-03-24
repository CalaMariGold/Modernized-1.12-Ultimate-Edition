// no_run

// Auto generated groovyscript example file
// MODS_LOADED: hbm

log 'mod \'hbm\' detected, running script'

// groovyscript.wiki.hbm.anvil_construction.title:
// groovyscript.wiki.hbm.anvil_construction.description.

mods.hbm.anvil_construction.removeAllNone(item('minecraft:clay'))
mods.hbm.anvil_construction.removeAllSmithing(item('minecraft:clay'))
mods.hbm.anvil_construction.removeAllRecycling(item('minecraft:clay'))
mods.hbm.anvil_construction.removeAllConstruction(item('minecraft:clay'))
// mods.hbm.anvil_construction.removeAll()

mods.hbm.anvil_construction.recipeBuilder()
    .input(item('minecraft:clay'), item('minecraft:clay'))
    .OverlayConstruction()
    .output(item('minecraft:diamond'))
    .register()
    .register()

mods.hbm.anvil_construction.recipeBuilder()
    .input(item('minecraft:clay'))
    .output(item('minecraft:diamond')*2, item('minecraft:diamond')*2)
    .OverlayRecycling()
    .maxTier(4)
    .register()
    .register()


// groovyscript.wiki.hbm.anvil_smithing.title:
// groovyscript.wiki.hbm.anvil_smithing.description.

mods.hbm.anvil_smithing.removeByOutput(item('minecraft:clay'))
// mods.hbm.anvil_smithing.removeAll()

mods.hbm.anvil_smithing.recipeBuilder()
    .input(item('minecraft:clay'), item('minecraft:clay'))
    .tierIron()
    .output(item('minecraft:diamond'))
    .register()

mods.hbm.anvil_smithing.recipeBuilder()
    .input(item('minecraft:clay'), item('minecraft:clay'))
    .tier(2)
    .output(item('minecraft:diamond')*2)
    .register()


// groovyscript.wiki.hbm.blast_furnace.title:
// groovyscript.wiki.hbm.blast_furnace.description.

// mods.hbm.blast_furnace.removeAll()

// groovyscript.wiki.hbm.blast_furnace_fuel.title:
// groovyscript.wiki.hbm.blast_furnace_fuel.description.

// groovyscript.wiki.hbm.bobmazon.title:
// groovyscript.wiki.hbm.bobmazon.description.

// mods.hbm.bobmazon.removeAll()

// groovyscript.wiki.hbm.breeding_reactor.title:
// groovyscript.wiki.hbm.breeding_reactor.description.

// groovyscript.wiki.hbm.centrifuge.title:
// groovyscript.wiki.hbm.centrifuge.description.

// groovyscript.wiki.hbm.dfc.title:
// groovyscript.wiki.hbm.dfc.description.

// groovyscript.wiki.hbm.fluidhazards.title:
// groovyscript.wiki.hbm.fluidhazards.description.

// groovyscript.wiki.hbm.hazards.title:
// groovyscript.wiki.hbm.hazards.description.

// groovyscript.wiki.hbm.irradiation_channel.title:
// groovyscript.wiki.hbm.irradiation_channel.description.

// groovyscript.wiki.hbm.press.title:
// groovyscript.wiki.hbm.press.description.

// groovyscript.wiki.hbm.shredder.title:
// groovyscript.wiki.hbm.shredder.description.

// groovyscript.wiki.hbm.silex.title:
// groovyscript.wiki.hbm.silex.description.

// groovyscript.wiki.hbm.waste_drum.title:
// groovyscript.wiki.hbm.waste_drum.description.
