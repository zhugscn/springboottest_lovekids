systemctl daemon-reload
systemctl restart docker

systemctl start etcd
systemctl start kube-apiserver
systemctl start kube-controller-manager
systemctl start kube-scheduler
systemctl start kubelet
systemctl start kube-proxy
systemctl start docker

#kubectl create -f mysql-rc.yaml
#kubectl create -f mysql-svc.yaml
#kubectl create -f myweb-rc.yaml
#kubectl create -f myweb-svc.yaml
#kubectl create -f lovekidsdemo-rc.yaml
#kubectl create -f lovekidsdemo-svc.yaml

