def persona = new Expando()
persona.nombre = "Pepe"
persona.saluda = { "Hola, me llamo $nombre" }

println persona.saluda()
persona.nombre = "Juan"
println persona.saluda()