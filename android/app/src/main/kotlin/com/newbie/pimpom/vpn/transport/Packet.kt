package com.newbie.pimpom.vpn.transport

import com.newbie.pimpom.vpn.transport.protocol.IP4Header
import com.newbie.pimpom.vpn.transport.protocol.TransportHeader

class Packet(var ipHeader: IP4Header, var transportHeader: TransportHeader, var buffer: ByteArray) {
}