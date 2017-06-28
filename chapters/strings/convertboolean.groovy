// Groovy can convert different String values
// to a Boolean.
assert "y".toBoolean()
assert 'TRUE'.toBoolean()
assert '  trUe  '.toBoolean()
assert " y".toBoolean()
assert "1".toBoolean()

assert ! 'other'.toBoolean()
assert ! '0'.toBoolean()
assert ! 'no'.toBoolean()
assert ! '  FalSe'.toBoolean()
