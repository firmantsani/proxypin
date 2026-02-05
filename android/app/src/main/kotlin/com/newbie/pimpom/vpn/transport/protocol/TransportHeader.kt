package com.newbie.pimpom.vpn.transport.protocol

interface TransportHeader {
    fun getSourcePort(): Int
    fun getDestinationPort(): Int
}