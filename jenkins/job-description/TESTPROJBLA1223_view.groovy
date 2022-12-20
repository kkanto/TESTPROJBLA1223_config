 
listView('TESTPROJBLA1223 Jobs') {
    description('TESTPROJBLA1223 Jobs')
    jobs {
        regex('TESTPROJBLA1223_.+')
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
