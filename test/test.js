const request = require('supertest')
const http = require('http')
const app  = require('../index')
const config = require('./config')


let token = ''


describe('# 测试接口', () => {
  it('# get /user/sigin', async() => {
    let res = await request(app)
        .post('/user/signin')
        .send(config.user)
        .expect(200)
        token = JSON.parse(res.text).token
  })

  it('#post /order/neworder', async() => {   
    let order = await request(app)
        .post('/order/neworder')
        .set('Authorization', 'Bearer '+ token)
        .send(config.order)
        .expect(200)
        .catch(err => {
          console.log(err)
        })
        console.log(JSON.parse(order.text).data.orderid)
        config.order.orderid = JSON.parse(order.text).data.orderid
  })

  it('#post /aplipay/pay1', async() => {   
    let order = await request(app)
        .post('/aplipay/pay1')
        .set('Authorization', 'Bearer '+ token)
        .send(config.order)
        .expect(200)
        .catch(err => {
          console.log(err)
        })
        console.log(JSON.parse(order.text))
  })
})


