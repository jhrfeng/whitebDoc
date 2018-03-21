var moment       = require('moment');
var schedule     = require("node-schedule"); 
var request      = require('request');
var db           = require('./config/mongo_database');
var tokenManager = require('./config/token_manager');
var redisClient  = require('./config/redis_database').redisClient;
var users        = require('./users');

// 获取所有用户信息
// function run(){
// 	db.userModel.find({roletype:'0'}, function(err, list){
// 		list.map(function (act) {
// 			console.log("'"+act['_id']+"' : '"+ act['name'] + act['username']+"'," )
// 		})
// 	})
// }

// 获取所有用户信息
function run(){
	var user = users.users;

	db.orderModel.find({status:'3'}, function(err, list){
		list.map(function (order) {
			var userid = order.userid.replace("'", "");
			userid = userid.replace("'", "");

			console.log(user[userid], order.pid.name, order.payAmount+'元', order.openAmount+'元', moment(order.created).format('YYYY-MM-DD'))
		})
	})
}

run()
