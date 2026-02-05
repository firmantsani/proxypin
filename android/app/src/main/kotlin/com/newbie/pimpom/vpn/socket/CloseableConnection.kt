package com.newbie.pimpom.vpn.socket

import com.newbie.pimpom.vpn.Connection

interface CloseableConnection {
    /**
     * 关闭连接
     */
    fun closeConnection(connection: Connection)
}