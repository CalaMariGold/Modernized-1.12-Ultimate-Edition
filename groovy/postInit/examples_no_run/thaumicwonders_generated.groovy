// no_run

// Auto generated groovyscript example file
// MODS_LOADED: thaumicwonders

log 'mod \'thaumicwonders\' detected, running script'

// Catalyzation Chamber:
// Uses a catalyst to transform items.

mods.thaumicwonders.catalyzation_chamber.removeByInput(ore('ingotIron'))
mods.thaumicwonders.catalyzation_chamber.removeByInput(item('minecraft:iron_ingot'))
mods.thaumicwonders.catalyzation_chamber.removeByInput(ore('ingotIron'), item('thaumicwonders:alchemist_stone'))
mods.thaumicwonders.catalyzation_chamber.removeByInput(item('minecraft:iron_ingot'), item('thaumicwonders:alchemist_stone'))
mods.thaumicwonders.catalyzation_chamber.removeByOutput(item('minecraft:iron_ingot'))
mods.thaumicwonders.catalyzation_chamber.removeByOutput(item('minecraft:iron_ingot'), item('thaumicwonders:alchemist_stone'))
// mods.thaumicwonders.catalyzation_chamber.removeAll()

mods.thaumicwonders.catalyzation_chamber.recipeBuilder()
    .setInput(item('minecraft:iron_ore'))
    .setCatalyst(item('thaumicwonders:alchemist_stone'))
    .setOutput(item('thaumcraft:cluster:0'))
    .setFluxChance(50)
    .setParticleColor(aspect('ordo'))
    .register()

mods.thaumicwonders.catalyzation_chamber.recipeBuilder()
    .setInput(ore('oreIron'))
    .setCatalyst(item('thaumicwonders:alchemist_stone'))
    .setOutput(item('thaumcraft:cluster:0'))
    .setFluxChance(50)
    .setParticleColor(aspect('ordo'))
    .register()


mods.thaumicwonders.catalyzation_chamber.addRecipe(ore('oreIron'), item('thaumicwonders:alchemist_stone'), item('thaumcraft:cluster:0', 50), aspect('ordo'))
mods.thaumicwonders.catalyzation_chamber.addRecipe(item('minecraft:iron_ore'), item('thaumicwonders:alchemist_stone'), item('thaumcraft:cluster:0'), 50, aspect('ordo'))
mods.thaumicwonders.catalyzation_chamber.addRecipe(ore('oreIron'), item('thaumicwonders:alchemist_stone'), item('thaumcraft:cluster:0', 50))
mods.thaumicwonders.catalyzation_chamber.addRecipe(item('minecraft:iron_ore'), item('thaumicwonders:alchemist_stone'), item('thaumcraft:cluster:0'), 50)
mods.thaumicwonders.catalyzation_chamber.addAlchemistRecipe(ore('oreIron'), item('thaumcraft:cluster:0'))
mods.thaumicwonders.catalyzation_chamber.addAlchemistRecipe(item('minecraft:iron_ore'), item('thaumcraft:cluster:0'))
mods.thaumicwonders.catalyzation_chamber.addTransmuterRecipe(ore('ingotIron'), item('minecraft:gold_ingot'))
mods.thaumicwonders.catalyzation_chamber.addTransmuterRecipe(item('minecraft:iron_ingot'), item('minecraft:gold_ingot'))
mods.thaumicwonders.catalyzation_chamber.addAlienistRecipe(ore('oreIron'), item('thaumicwonders:eldritch_cluster:0'))
mods.thaumicwonders.catalyzation_chamber.addAlienistRecipe(item('minecraft:iron_ore'), item('thaumicwonders:eldritch_cluster:0'))

// Meaty Orb:
// Uses essentia to cause a localized meaty rainstorm.

mods.thaumicwonders.meaty_orb.remove(item('minecraft:beef'))
// mods.thaumicwonders.meaty_orb.removeAll()

mods.thaumicwonders.meaty_orb.recipeBuilder()
    .setMeat(item('minecraft:beef'))
    .setWeight(30)
    .register()


mods.thaumicwonders.meaty_orb.add(item('minecraft:beef'), 30)
