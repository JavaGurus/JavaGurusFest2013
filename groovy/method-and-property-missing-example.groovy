class Foo {
   def propertyMissing(String name) { "Obtiene propiedad: $name" }
   def methodMissing(String name, args){ "Se invocó: $name \n con argumentos: $args "}
}
def f = new Foo()

println f.goo

println f.algo()
println f.metodonoexistente("argumento1","Argumento2")