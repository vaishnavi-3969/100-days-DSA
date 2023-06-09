# syntax: bytes(Src,[encoding,error])
S = bytes([1,2,3])
# S = bytes('data') => this will throw error coz compiler don't understand the encoding directly
S = bytes('data', 'ascii')
# ascii encoding is used to convert the string into bytes
# S = bytes('data', 'ascii', 'ignore') => error occurs on ignore mode
