import static groovyx.gpars.GParsPool.withPool

withPool {
    def urls = ['http://www.dzone.com', 'http://www.theserverside.com', 'http://www.infoq.com']
 
    Closure download = {url ->
        println "Descargando $url"
        url.toURL().text.toUpperCase()
    }
    
    println 'Sitios que contienen Groovy el día de hoy: \n' + 
        urls.findAllParallel {
            url -> download(url).contains('GROOVY')
        }
}