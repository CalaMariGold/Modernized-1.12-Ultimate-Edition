// no_run

// Auto generated groovyscript example file
// MODS_LOADED: harkenscythe

log 'mod \'harkenscythe\' detected, running script'

// groovyscript.wiki.harkenscythe.blood_altar.title:
// groovyscript.wiki.harkenscythe.blood_altar.description.

mods.harkenscythe.blood_altar.removeByInput(item('minecraft:glass_bottle'))
mods.harkenscythe.blood_altar.removeByOutput(item('harkenscythe:bloodweave_cloth'))
// mods.harkenscythe.blood_altar.removeAll()

mods.harkenscythe.blood_altar.recipeBuilder()
    .input(item('minecraft:cobblestone'))
    .output(item('minecraft:gravel'))
    .requiredBlood(42)
    .register()


// groovyscript.wiki.harkenscythe.soul_altar.title:
// groovyscript.wiki.harkenscythe.soul_altar.description.

mods.harkenscythe.soul_altar.removeByInput(item('minecraft:cookie'))
mods.harkenscythe.soul_altar.removeByOutput(item('harkenscythe:soul_cake'))
// mods.harkenscythe.soul_altar.removeAll()

mods.harkenscythe.soul_altar.recipeBuilder()
    .input(item('minecraft:gravel'))
    .output(item('minecraft:sand'))
    .requiredSouls(69)
    .register()
