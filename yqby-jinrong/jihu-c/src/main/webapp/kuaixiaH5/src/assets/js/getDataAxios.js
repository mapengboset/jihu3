import axios from 'axios'
// import store from '../store'


export function getData(url,data) {
//如果type为空，默认为post方法，也可以自己改成get
  return axios.post(url, data,{
    headers: {
      "token":data.token,
      'app':'11111'
    },
  }).then((response) => {
       // console.log('response', response);
       return response;
     })
     .catch((error) => {
       // console.log('error', error);
       return error;
     });
}
export function getLogin(url,data) {
//如果type为空，默认为post方法，也可以自己改成get
  return axios.post(url, data,{
    headers: {
      // 'token':data.token,
      'appChannel':1111111111111
    },
  }).then((response) => {
       // console.log('response', response);
       return response;
     })
     .catch((error) => {
       // console.log('error', error);
       return error;
     });
}
