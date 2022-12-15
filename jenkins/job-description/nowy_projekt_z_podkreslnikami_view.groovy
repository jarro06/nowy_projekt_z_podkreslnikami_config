 
listView('nowy_projekt_z_podkreslnikami Jobs') {
    description('nowy_projekt_z_podkreslnikami Jobs')
    jobs {
        regex('nowy_projekt_z_podkreslnikami_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
